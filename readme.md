[![Mou banner](http://b.content.wso2.com/sites/all/themes/wso2-v6/images/products-logos/esb-logo-h42.png)](http://wso2.com/products/enterprise-service-bus/)

#WSO2 Enterprise Service Bus Exploration Project
**IF-4050 Experimentals Services on WSO2 ESB**


## Overview

[**WSO2 ESB**](http://wso2.com/products/enterprise-service-bus/), as an ESB *WSO2 ESB* is constructed to enable communication among various applications (in this case we only tried with a few services). **Here** we enable some of our simple services as shown above that is registered in our WSO2 ESB.

[![Mou banner](https://s3.amazonaws.com/cloud.ohloh.net/attachments/21894/esb64_med.png)](http://wso2.com/products/enterprise-service-bus/)


This read me includes several section that explain this project. Sections are :

- Story
- Technical Explanation
- Exploration


## The Story
In this project we choose to explore the chaining function in WSO2 ESB. The following are the story of our exploration scenario.

### Chaining
To test the chaining function of ESB we create a few simple services to communicate within the ESB.

####The Scene
So, we have a service that serves high schools students who just have take a test (SNMPTN) to be a student of their dream universities.

In our case, we have the services as shown below. These services serve newly accepted students to check their test results and inform them to complete the payment and register to their new school.

The services are :

- Pengecekan kelulusan SNMPTN (By Fatoni)
- Pemrosesan pendaftaran ulang (by Andy)
- Pemrosesan tagihan pembayaran (by Harya)
- Service Central (by Hendy)

##Services Explanation
###Pengecekan kelulusan SNMPTN
This service enable test participants to check their result by inputing their test number. Status will shown as result for inputing test number.

####service usage
	/service/snmptn?wsdl
-------
	
###Pemrosesan pendaftaran ulang
*pemrosesan pendaftaran ulang* serve newly accepted students to register. The service will receive a set of number which represent the students test number and return the allocated faculty and student number represented by **NIM** for them.

####service usage
	/service/pendaftaran_itb?wsdl
-------
###Pemrosesan tagihan pembayaran

Now, for the invoicing service we call __*pemrosesan tagihan pembayaran*__. This will generate the complete payment needed for the newly accepted students by inputing __*NIM*__. The result that'll responded by this service is number of the payment needed to pay.
####service usage
	/services/Cek?wsdl



## Technical Explanation

[![Service Orchestration](http://wso2.com/files/service_orchestration_1.png)](http://wso2.com/files/service_orchestration_1.png)

The things we do is similar to the image above, we manage the communication between several services that create a function as we explained sections before.

[![Service Orchestration 2](http://4.bp.blogspot.com/-4CZdJhHYSU0/T-iZZMQLs4I/AAAAAAAAAUI/_YR9QL9ZgR8/s1600/Screenshot-2.png)](http://4.bp.blogspot.com/-4CZdJhHYSU0/T-iZZMQLs4I/AAAAAAAAAUI/_YR9QL9ZgR8/s1600/Screenshot-2.png)


## Exploration
Each of our services now already running but, the 'chaining' part is not cleary done.
There are some trouble creating the sequence in order to prove the chaining function of esb.

So in order to simulate the orchestration in ESB, temporarily we create a **service central** module that function to orchestrate our services.
and use the WSO2 ESB as a proxy.


## The Team

- M Harya Putra <18211011@std.stei.itb.ac.id>
- Andy Primawan <18211030@std.stei.itb.ac.id>
- Christian Hendy <18211036@std.stei.itb.ac.id>
- M Fatoni <18211042@std.stei.itb.ac.id>
- Aria Dhanang <182110@std.stei.itb.ac.id>