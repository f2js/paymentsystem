package paymentsystem;

import grpc.PaymentSystem;
import io.grpc.stub.StreamObserver;
import grpc.PaymentSystem.APIResponse;
import grpc.PaymentSystem.PaymentRequest;

import java.util.Random;

public class PaymentService extends grpc.PaymentServiceGrpc.PaymentServiceImplBase {
    @Override
    public void payment(PaymentRequest request, StreamObserver<PaymentSystem.APIResponse> responseObserver) {
        Integer orderId = request.getOrderId();
        Double orderPrice = (request.getOrderPrice());

        String stringResponse ="OrderId: " + orderId + ", orderPrice: " + orderPrice + " kr";

        //Make interface "fail occasionally"
        Random rand = new Random(); //instance of random class
        int upperbound = 4;
        int int_random = rand.nextInt(upperbound);

        APIResponse.Builder response = APIResponse.newBuilder();
        if(orderId != null || orderPrice != null){
            if(int_random == 0){
                response.setResponseCode(500).setResponsemessage("|PAYMENT FAILURE|");
            } else {
                response.setResponseCode(200).setResponsemessage("|PAYMENT SUCCESS| " + stringResponse );
            }
        } else {
            response.setResponseCode(400).setResponsemessage("|FAILURE| " + stringResponse);
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}