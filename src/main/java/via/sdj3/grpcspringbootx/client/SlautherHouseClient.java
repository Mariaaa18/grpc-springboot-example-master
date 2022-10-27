package via.sdj3.grpcspringbootx.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import via.sdj3.grpcspringbootx.protobuf.RequestText;
import via.sdj3.grpcspringbootx.protobuf.ResponseText;
import via.sdj3.grpcspringbootx.protobuf.SlautherHouseGrpc;

public class SlautherHouseClient {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 8084)
                .usePlaintext()
                .build();
        SlautherHouseGrpc.SlautherHouseBlockingStub slautherHouseStub
                = SlautherHouseGrpc.newBlockingStub(managedChannel);
        RequestText request = RequestText.newBuilder()
                .setInputText("uaslsdfjal")
                .build();

        RequestText request2 = RequestText.newBuilder()
                .setInputText("ijasosjklj")
                .build();
        ResponseText response= slautherHouseStub.getAnimals(request);
        ResponseText response2= slautherHouseStub.getProducts(request2);


        for (int i = 0; i < response.getAllFields().size(); i++) {
            System.out.println(response.getOutputText(i));
        }
        for (int i = 0; i < response.getAllFields().size(); i++) {
            System.out.println(response2.getOutputText(i));
        }


    }
}
