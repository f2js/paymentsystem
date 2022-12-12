# PAYMENT SYSTEM

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