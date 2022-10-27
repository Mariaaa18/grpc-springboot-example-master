package via.sdj3.grpcspringbootx.protobuf;

import java.sql.SQLException;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *service definitions
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: SlautherHouse.proto")
public final class SlautherHouseGrpc {

  private SlautherHouseGrpc() {}

  public static final String SERVICE_NAME = "SlautherHouse";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sdj3.grpcspringbootx.protobuf.RequestText,
      via.sdj3.grpcspringbootx.protobuf.ResponseText> getGetAnimalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnimals",
      requestType = via.sdj3.grpcspringbootx.protobuf.RequestText.class,
      responseType = via.sdj3.grpcspringbootx.protobuf.ResponseText.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.grpcspringbootx.protobuf.RequestText,
      via.sdj3.grpcspringbootx.protobuf.ResponseText> getGetAnimalsMethod() {
    io.grpc.MethodDescriptor<via.sdj3.grpcspringbootx.protobuf.RequestText, via.sdj3.grpcspringbootx.protobuf.ResponseText> getGetAnimalsMethod;
    if ((getGetAnimalsMethod = SlautherHouseGrpc.getGetAnimalsMethod) == null) {
      synchronized (SlautherHouseGrpc.class) {
        if ((getGetAnimalsMethod = SlautherHouseGrpc.getGetAnimalsMethod) == null) {
          SlautherHouseGrpc.getGetAnimalsMethod = getGetAnimalsMethod =
              io.grpc.MethodDescriptor.<via.sdj3.grpcspringbootx.protobuf.RequestText, via.sdj3.grpcspringbootx.protobuf.ResponseText>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAnimals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.grpcspringbootx.protobuf.RequestText.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.grpcspringbootx.protobuf.ResponseText.getDefaultInstance()))
              .setSchemaDescriptor(new SlautherHouseMethodDescriptorSupplier("getAnimals"))
              .build();
        }
      }
    }
    return getGetAnimalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.grpcspringbootx.protobuf.RequestText,
      via.sdj3.grpcspringbootx.protobuf.ResponseText> getGetProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProducts",
      requestType = via.sdj3.grpcspringbootx.protobuf.RequestText.class,
      responseType = via.sdj3.grpcspringbootx.protobuf.ResponseText.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.grpcspringbootx.protobuf.RequestText,
      via.sdj3.grpcspringbootx.protobuf.ResponseText> getGetProductsMethod() {
    io.grpc.MethodDescriptor<via.sdj3.grpcspringbootx.protobuf.RequestText, via.sdj3.grpcspringbootx.protobuf.ResponseText> getGetProductsMethod;
    if ((getGetProductsMethod = SlautherHouseGrpc.getGetProductsMethod) == null) {
      synchronized (SlautherHouseGrpc.class) {
        if ((getGetProductsMethod = SlautherHouseGrpc.getGetProductsMethod) == null) {
          SlautherHouseGrpc.getGetProductsMethod = getGetProductsMethod =
              io.grpc.MethodDescriptor.<via.sdj3.grpcspringbootx.protobuf.RequestText, via.sdj3.grpcspringbootx.protobuf.ResponseText>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.grpcspringbootx.protobuf.RequestText.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.grpcspringbootx.protobuf.ResponseText.getDefaultInstance()))
              .setSchemaDescriptor(new SlautherHouseMethodDescriptorSupplier("getProducts"))
              .build();
        }
      }
    }
    return getGetProductsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SlautherHouseStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlautherHouseStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlautherHouseStub>() {
        @java.lang.Override
        public SlautherHouseStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlautherHouseStub(channel, callOptions);
        }
      };
    return SlautherHouseStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SlautherHouseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlautherHouseBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlautherHouseBlockingStub>() {
        @java.lang.Override
        public SlautherHouseBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlautherHouseBlockingStub(channel, callOptions);
        }
      };
    return SlautherHouseBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SlautherHouseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlautherHouseFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlautherHouseFutureStub>() {
        @java.lang.Override
        public SlautherHouseFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlautherHouseFutureStub(channel, callOptions);
        }
      };
    return SlautherHouseFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *service definitions
   * </pre>
   */
  public static abstract class SlautherHouseImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAnimals(via.sdj3.grpcspringbootx.protobuf.RequestText request,
        io.grpc.stub.StreamObserver<via.sdj3.grpcspringbootx.protobuf.ResponseText> responseObserver) throws SQLException {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalsMethod(), responseObserver);
    }

    /**
     */
    public void getProducts(via.sdj3.grpcspringbootx.protobuf.RequestText request,
        io.grpc.stub.StreamObserver<via.sdj3.grpcspringbootx.protobuf.ResponseText> responseObserver) throws SQLException {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAnimalsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.grpcspringbootx.protobuf.RequestText,
                via.sdj3.grpcspringbootx.protobuf.ResponseText>(
                  this, METHODID_GET_ANIMALS)))
          .addMethod(
            getGetProductsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.grpcspringbootx.protobuf.RequestText,
                via.sdj3.grpcspringbootx.protobuf.ResponseText>(
                  this, METHODID_GET_PRODUCTS)))
          .build();
    }
  }

  /**
   * <pre>
   *service definitions
   * </pre>
   */
  public static final class SlautherHouseStub extends io.grpc.stub.AbstractAsyncStub<SlautherHouseStub> {
    private SlautherHouseStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlautherHouseStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlautherHouseStub(channel, callOptions);
    }

    /**
     */
    public void getAnimals(via.sdj3.grpcspringbootx.protobuf.RequestText request,
        io.grpc.stub.StreamObserver<via.sdj3.grpcspringbootx.protobuf.ResponseText> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProducts(via.sdj3.grpcspringbootx.protobuf.RequestText request,
        io.grpc.stub.StreamObserver<via.sdj3.grpcspringbootx.protobuf.ResponseText> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *service definitions
   * </pre>
   */
  public static final class SlautherHouseBlockingStub extends io.grpc.stub.AbstractBlockingStub<SlautherHouseBlockingStub> {
    private SlautherHouseBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlautherHouseBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlautherHouseBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sdj3.grpcspringbootx.protobuf.ResponseText getAnimals(via.sdj3.grpcspringbootx.protobuf.RequestText request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalsMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.grpcspringbootx.protobuf.ResponseText getProducts(via.sdj3.grpcspringbootx.protobuf.RequestText request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *service definitions
   * </pre>
   */
  public static final class SlautherHouseFutureStub extends io.grpc.stub.AbstractFutureStub<SlautherHouseFutureStub> {
    private SlautherHouseFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlautherHouseFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlautherHouseFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.grpcspringbootx.protobuf.ResponseText> getAnimals(
        via.sdj3.grpcspringbootx.protobuf.RequestText request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.grpcspringbootx.protobuf.ResponseText> getProducts(
        via.sdj3.grpcspringbootx.protobuf.RequestText request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ANIMALS = 0;
  private static final int METHODID_GET_PRODUCTS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SlautherHouseImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SlautherHouseImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ANIMALS:
          serviceImpl.getAnimals((via.sdj3.grpcspringbootx.protobuf.RequestText) request,
              (io.grpc.stub.StreamObserver<via.sdj3.grpcspringbootx.protobuf.ResponseText>) responseObserver);
          break;
        case METHODID_GET_PRODUCTS:
          serviceImpl.getProducts((via.sdj3.grpcspringbootx.protobuf.RequestText) request,
              (io.grpc.stub.StreamObserver<via.sdj3.grpcspringbootx.protobuf.ResponseText>) responseObserver);
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

  private static abstract class SlautherHouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SlautherHouseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sdj3.grpcspringbootx.protobuf.SlautherHouseOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SlautherHouse");
    }
  }

  private static final class SlautherHouseFileDescriptorSupplier
      extends SlautherHouseBaseDescriptorSupplier {
    SlautherHouseFileDescriptorSupplier() {}
  }

  private static final class SlautherHouseMethodDescriptorSupplier
      extends SlautherHouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SlautherHouseMethodDescriptorSupplier(String methodName) {
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
      synchronized (SlautherHouseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SlautherHouseFileDescriptorSupplier())
              .addMethod(getGetAnimalsMethod())
              .addMethod(getGetProductsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
