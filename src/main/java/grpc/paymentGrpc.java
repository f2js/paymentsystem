package grpc;

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
public final class paymentGrpc {

  private paymentGrpc() {}

  public static final String SERVICE_NAME = "grpc.payment";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.PaymentSystem.PaymentRequest,
      grpc.PaymentSystem.APIResponse> getPaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "payment",
      requestType = grpc.PaymentSystem.PaymentRequest.class,
      responseType = grpc.PaymentSystem.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.PaymentSystem.PaymentRequest,
      grpc.PaymentSystem.APIResponse> getPaymentMethod() {
    io.grpc.MethodDescriptor<grpc.PaymentSystem.PaymentRequest, grpc.PaymentSystem.APIResponse> getPaymentMethod;
    if ((getPaymentMethod = paymentGrpc.getPaymentMethod) == null) {
      synchronized (paymentGrpc.class) {
        if ((getPaymentMethod = paymentGrpc.getPaymentMethod) == null) {
          paymentGrpc.getPaymentMethod = getPaymentMethod = 
              io.grpc.MethodDescriptor.<grpc.PaymentSystem.PaymentRequest, grpc.PaymentSystem.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.payment", "payment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.PaymentSystem.PaymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.PaymentSystem.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new paymentMethodDescriptorSupplier("payment"))
                  .build();
          }
        }
     }
     return getPaymentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static paymentStub newStub(io.grpc.Channel channel) {
    return new paymentStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static paymentBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new paymentBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static paymentFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new paymentFutureStub(channel);
  }

  /**
   */
  public static abstract class paymentImplBase implements io.grpc.BindableService {

    /**
     */
    public void payment(grpc.PaymentSystem.PaymentRequest request,
        io.grpc.stub.StreamObserver<grpc.PaymentSystem.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPaymentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPaymentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.PaymentSystem.PaymentRequest,
                grpc.PaymentSystem.APIResponse>(
                  this, METHODID_PAYMENT)))
          .build();
    }
  }

  /**
   */
  public static final class paymentStub extends io.grpc.stub.AbstractStub<paymentStub> {
    private paymentStub(io.grpc.Channel channel) {
      super(channel);
    }

    private paymentStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected paymentStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new paymentStub(channel, callOptions);
    }

    /**
     */
    public void payment(grpc.PaymentSystem.PaymentRequest request,
        io.grpc.stub.StreamObserver<grpc.PaymentSystem.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPaymentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class paymentBlockingStub extends io.grpc.stub.AbstractStub<paymentBlockingStub> {
    private paymentBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private paymentBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected paymentBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new paymentBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.PaymentSystem.APIResponse payment(grpc.PaymentSystem.PaymentRequest request) {
      return blockingUnaryCall(
          getChannel(), getPaymentMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class paymentFutureStub extends io.grpc.stub.AbstractStub<paymentFutureStub> {
    private paymentFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private paymentFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected paymentFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new paymentFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.PaymentSystem.APIResponse> payment(
        grpc.PaymentSystem.PaymentRequest request) {
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
    private final paymentImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(paymentImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PAYMENT:
          serviceImpl.payment((grpc.PaymentSystem.PaymentRequest) request,
              (io.grpc.stub.StreamObserver<grpc.PaymentSystem.APIResponse>) responseObserver);
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

  private static abstract class paymentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    paymentBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.PaymentSystem.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("payment");
    }
  }

  private static final class paymentFileDescriptorSupplier
      extends paymentBaseDescriptorSupplier {
    paymentFileDescriptorSupplier() {}
  }

  private static final class paymentMethodDescriptorSupplier
      extends paymentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    paymentMethodDescriptorSupplier(String methodName) {
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
      synchronized (paymentGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new paymentFileDescriptorSupplier())
              .addMethod(getPaymentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
