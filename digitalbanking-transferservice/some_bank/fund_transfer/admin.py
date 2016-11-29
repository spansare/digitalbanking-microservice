from django.contrib import admin

# Register your models here.


from .models import Payee, Customer, CustomerAccount, FundTransfer

admin.site.register(Payee)
admin.site.register(Customer)
admin.site.register(CustomerAccount)
admin.site.register(FundTransfer)
