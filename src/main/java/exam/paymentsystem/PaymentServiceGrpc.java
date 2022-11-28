package exam.paymentsystem;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: PaymentSystem.proto")
public final class PaymentServiceGrpc {

  private PaymentServiceGrpc() {}

  public static final String SERVICE_NAME = "exam.paymentsystem.PaymentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<exam.paymentsystem.PaymentRequest,
      exam.paymentsystem.PaymentResponse> getPaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "payment",
      requestType = exam.paymentsystem.PaymentRequest.class,
      responseType = exam.paymentsystem.PaymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<exam.paymentsystem.PaymentRequest,
      exam.paymentsystem.PaymentResponse> getPaymentMethod() {
    io.grpc.MethodDescriptor<exam.paymentsystem.PaymentRequest, exam.paymentsystem.PaymentResponse> getPaymentMethod;
    if ((getPaymentMethod = PaymentServiceGrpc.getPaymentMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getPaymentMethod = PaymentServiceGrpc.getPaymentMethod) == null) {
          PaymentServiceGrpc.getPaymentMethod = getPaymentMethod = 
              io.grpc.MethodDescriptor.<exam.paymentsystem.PaymentRequest, exam.paymentsystem.PaymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "exam.paymentsystem.PaymentService", "payment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  exam.paymentsystem.PaymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  exam.paymentsystem.PaymentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("payment"))
                  .build();
          }
        }
     }
     return getPaymentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PaymentServiceStub newStub(io.grpc.Channel channel) {
    return new PaymentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PaymentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PaymentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PaymentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PaymentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PaymentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void payment(exam.paymentsystem.PaymentRequest request,
        io.grpc.stub.StreamObserver<exam.paymentsystem.PaymentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPaymentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPaymentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                exam.paymentsystem.PaymentRequest,
                exam.paymentsystem.PaymentResponse>(
                  this, METHODID_PAYMENT)))
          .build();
    }
  }

  /**
   */
  public static final class PaymentServiceStub extends io.grpc.stub.AbstractStub<PaymentServiceStub> {
    private PaymentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PaymentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PaymentServiceStub(channel, callOptions);
    }

    /**
     */
    public void payment(exam.paymentsystem.PaymentRequest request,
        io.grpc.stub.StreamObserver<exam.paymentsystem.PaymentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPaymentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PaymentServiceBlockingStub extends io.grpc.stub.AbstractStub<PaymentServiceBlockingStub> {
    private PaymentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PaymentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PaymentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public exam.paymentsystem.PaymentResponse payment(exam.paymentsystem.PaymentRequest request) {
      return blockingUnaryCall(
          getChannel(), getPaymentMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PaymentServiceFutureStub extends io.grpc.stub.AbstractStub<PaymentServiceFutureStub> {
    private PaymentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PaymentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PaymentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<exam.paymentsystem.PaymentResponse> payment(
        exam.paymentsystem.PaymentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPaymentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PAYMENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PaymentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PaymentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PAYMENT:
          serviceImpl.payment((exam.paymentsystem.PaymentRequest) request,
              (io.grpc.stub.StreamObserver<exam.paymentsystem.PaymentResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PaymentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return exam.paymentsystem.PaymentSystem.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PaymentService");
    }
  }

  private static final class PaymentServiceFileDescriptorSupplier
      extends PaymentServiceBaseDescriptorSupplier {
    PaymentServiceFileDescriptorSupplier() {}
  }

  private static final class PaymentServiceMethodDescriptorSupplier
      extends PaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PaymentServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PaymentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PaymentServiceFileDescriptorSupplier())
              .addMethod(getPaymentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
