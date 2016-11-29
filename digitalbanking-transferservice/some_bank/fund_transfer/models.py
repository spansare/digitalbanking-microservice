from django.db import models
from django.db.models import Q

# Create your models here.


ACCOUNT_TYPE_CHOICES = (
    ('s', 'Savings'),
    ('c', 'Current')
)


class Customer(models.Model):
    name = models.CharField(max_length=50)
    phone = models.CharField(max_length=15)
    email = models.EmailField(max_length=100)
    created_on = models.DateTimeField(auto_now_add=True)
    updated_on = models.DateTimeField(auto_now=True)


class PayeeListManager(models.Manager):
    def payee_for_customer(self, customer):
        # return super(PayeeListManager, self).get_queryset().filter(Q(customer_id = customer.id))
        return super(PayeeListManager, self).get_queryset().filter(Q(customer_id = '1'))

class Payee(models.Model):
    customer = models.ForeignKey(Customer)
    name = models.CharField(max_length=50)
    nick_name = models.CharField(max_length=30)
    account_number = models.CharField(max_length=35)
    account_type = models.CharField(max_length=1, default='s', choices=ACCOUNT_TYPE_CHOICES)
    bank_code = models.CharField(max_length=50)
    bank_name = models.CharField(max_length=50)
    bank_city = models.CharField(max_length=50)
    bank_branch = models.CharField(max_length=50)
    created_on = models.DateTimeField(auto_now_add=True)
    updated_on = models.DateTimeField(auto_now=True)
    objects = PayeeListManager()



class CustomerAccount(models.Model):
    customer = models.ForeignKey(Customer)
    account_number = models.CharField(max_length=35)
    account_type = models.CharField(max_length=1, default='s', choices=ACCOUNT_TYPE_CHOICES)
    balance = models.DecimalField(max_digits=14, decimal_places=2)   # 999,999,999,999.99
    created_on = models.DateTimeField(auto_now_add=True)
    updated_on = models.DateTimeField(auto_now=True)


class FundTransfer(models.Model):
    customer_account = models.ForeignKey(CustomerAccount)
    payee = models.ForeignKey(Payee)
    narration = models.CharField(max_length=100)
    amount = models.DecimalField(max_digits=14, decimal_places=2)   # 999,999,999,999.99
    balance = models.DecimalField(max_digits=14, decimal_places=2)  # 999,999,999,999.99
    created_on = models.DateTimeField(auto_now_add=True)
