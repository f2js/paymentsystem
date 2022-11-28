package paymentsystem;

import grpc.PaymentSystem;
import grpc.paymentGrpc.paymentImplBase;
import io.grpc.stub.StreamObserver;
import grpc.PaymentSystem.APIResponse;

public class PaymentService extends paymentImplBase {
    @Override
    public void payment(PaymentSystem.PaymentRequest request, StreamObserver<PaymentSystem.APIResponse> responseObserver) {
        Integer orderId = request.getOrderId();
        Double orderPrice = (request.getOrderPrice());

        String stringResponse ="OrderId: " + orderId + ", orderPrice: " + orderPrice + " kr";

        APIResponse.Builder response = APIResponse.newBuilder();
        if(orderId != null || orderPrice != null){
            response.setResponseCode(0).setResponsemessage("|SUCCESS| " + stringResponse );
        } else {
            response.setResponseCode(100).setResponsemessage("|FAILURE| " + stringResponse);
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
