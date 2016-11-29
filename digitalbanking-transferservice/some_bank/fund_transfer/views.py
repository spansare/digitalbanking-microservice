from django.shortcuts import render, redirect, get_object_or_404
from django.contrib.auth.decorators import login_required
from django.core.exceptions import PermissionDenied
from django.http import HttpResponse
from .models import Payee


# Create your views here.


@login_required
def same_bank_add_payee_form(request):
    # return HttpResponse("same_bank_add_payee")
    return render(request, 'fund_transfer/same_bank_add_payee_form.html')


@login_required
def same_bank_fund_transfer(request):
    # return HttpResponse("same_bank_fund_transfer")
    return render(request, 'fund_transfer/same_bank_fund_transfer_form.html')


@login_required
def same_bank_fund_transfer_list(request):
    # return HttpResponse("same_bank_fund_transfer_list - the test")
    return render(request, 'fund_transfer/same_bank_fund_transfer_list.html')


@login_required
def other_bank_add_payee_form(request):
    # return HttpResponse("other_bank_add_payee")
    return render(request, 'fund_transfer/other_bank_add_payee_form.html')


@login_required
def other_bank_fund_transfer(request):
    # return HttpResponse("other_bank_fund_transfer")
    # payee_list = Payee.objects.payee_for_customer(request.customer)
    payee_list = Payee.objects.payee_for_customer(1)
    return render(request, 'fund_transfer/other_bank_fund_transfer_form.html')


@login_required
def other_bank_fund_transfer_list(request):
    # return HttpResponse("other_bank_fund_transfer_list")
    return render(request, 'fund_transfer/other_bank_fund_transfer_list.html')