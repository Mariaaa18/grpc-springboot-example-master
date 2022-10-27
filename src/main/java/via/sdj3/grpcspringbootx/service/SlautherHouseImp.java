package via.sdj3.grpcspringbootx.service;

import io.grpc.stub.StreamObserver;
import via.sdj3.grpcspringbootx.persistance.AnimalDAO;
import via.sdj3.grpcspringbootx.persistance.ProductDAO;
import via.sdj3.grpcspringbootx.protobuf.RequestText;
import via.sdj3.grpcspringbootx.protobuf.ResponseText;
import via.sdj3.grpcspringbootx.protobuf.SlautherHouseGrpc;

import java.sql.SQLException;
import java.util.ArrayList;

public class SlautherHouseImp extends SlautherHouseGrpc.SlautherHouseImplBase {
   /* private AnimalDAO animalDAO= AnimalDAO.getInstance();
    private ProductDAO productDAO=ProductDAO.getInstance();*/

    private AnimalDAO animalDAO=new AnimalDAO();

    public SlautherHouseImp() throws SQLException {
    }

   /* @Override
    public void getAnimals(RequestText request, StreamObserver<ResponseText> responseObserver) throws SQLException {
        //super.getAnimals(request, responseObserver);
        System.out.println("Received Request ====> " + request.toString());
        ArrayList<String> resp= animalDAO.getAnimalsByProduct(request.toString());
        Iterable<String> list=   resp;
        ResponseText responseText= ResponseText.newBuilder().addAllOutputText(list).build();
        //  I do  not know if this would work
        responseObserver.onNext(responseText);
        responseObserver.onCompleted();

    }*/

    public void getAnimals(RequestText request, StreamObserver<ResponseText> responseObserver){
        //super.getAnimals(request, responseObserver);
        System.out.println("Received Request ====> " + request.toString());
        ArrayList<String> resp= animalDAO.getAnimalsByProduct(Integer.parseInt(request.toString())
        );
        Iterable<String> list=   resp;
        ResponseText responseText= ResponseText.newBuilder().addAllOutputText(list).build();
        //  I do  not know if this would work
        responseObserver.onNext(responseText);
        responseObserver.onCompleted();

    }

  /*  @Override
    public void getProducts(RequestText request, StreamObserver<ResponseText> responseObserver) throws SQLException {
        System.out.println("Received Request ====> " + request.toString());
        ArrayList<String> resp= productDAO.getProductsByAnimal(request.toString());
        Iterable<String> list=   resp;
        ResponseText responseText= ResponseText.newBuilder().addAllOutputText(list).build();
        //  I do  not know if this would work
        responseObserver.onNext(responseText);
        responseObserver.onCompleted();
    }*/
}
