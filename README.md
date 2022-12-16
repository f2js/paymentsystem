# PAYMENT SYSTEM
[![CircleCI](https://dl.circleci.com/status-badge/img/gh/f2js/paymentsystem/tree/main.svg?style=svg)](https://dl.circleci.com/status-badge/redirect/gh/f2js/paymentsystem/tree/main)

[![CircleCI](https://dl.circleci.com/insights-snapshot/gh/f2js/paymentsystem/main/build-deploy-master/badge.svg?window=30d)](https://app.circleci.com/insights/github/f2js/paymentsystem/workflows/build-deploy-master/overview?branch=main&reporting-window=last-30-days&insights-snapshot=true)

### Group members: 

**Name** Josef Marc Pedersen **Github** [@josefmarcc ](https://github.com/josefmarcc) **Email** cph-jp325@cphbusiness.dk  
**Name** Frederik Dinsen **Github**[@fdinsen](https://github.com/fdinsen) **Email** cph-fd77@cphbusiness.dk  
**Name** Sebastian Bentley **Github** [@sebastianbentley ](https://github.com/SebastianBentley) **Email** cph-sb287@cphbusiness.dk  
**Name** Frederik Dahl **Github** [@dahlfrederik ](https://github.com/dahlfrederik) **Email** cph-fd76@cphbusiness.dk  

## gRPC service

### Service Methods

#### payment(PaymentRequest) returns (APIResponse)

This method processes a payment for a specified order.

##### Request

The **PaymentRequest** message has the following fields:

- **orderId** : The ID of the order for which to process the payment.
- **orderPrice** : The price of the order.

##### Response

The **APIResponse** message has the following fields:

- **responseMessage** : A string indicating the status of the payment processing.
- **responseCode** : A code indicating the status of the payment processing. A value of **200** indicates a successful payment, while a value of **400** indicates a failure.
