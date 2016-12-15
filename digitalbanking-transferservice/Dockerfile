FROM python

RUN pip install virtualenv
RUN pip install Django

RUN git clone https://github.com/spansare/digitalbanking-microservice

RUN python /digitalbanking-microservice/digitalbanking-transferservice/bin/activate_this.py

RUN chmod +x /digitalbanking-microservice/digitalbanking-transferservice/bin/activate

RUN /digitalbanking-microservice/digitalbanking-transferservice/bin/activate

CMD ["python" , "/digitalbanking-microservice/digitalbanking-transferservice/some_bank/manage.py" , "runserver" ,"0.0.0.0:8000"]
