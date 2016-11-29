from django.conf.urls import url
from . import views

urlpatterns = [
    url(r'^same_bank_add_payee_form$', views.same_bank_add_payee_form, name='same_bank_add_payee_form'),
    url(r'^same_bank_fund_transfer_form$', views.same_bank_fund_transfer, name='same_bank_fund_transfer_form'),
    url(r'^same_bank_fund_transfer_list$', views.same_bank_fund_transfer_list, name='same_bank_fund_transfer_list'),
    url(r'^other_bank_add_payee_form$', views.other_bank_add_payee_form, name='other_bank_add_payee_form'),
    url(r'^other_bank_fund_transfer_form$', views.other_bank_fund_transfer, name='other_bank_fund_transfer_form'),
    url(r'^other_bank_fund_transfer_list$', views.other_bank_fund_transfer_list, name='other_bank_fund_transfer_list'),
]
