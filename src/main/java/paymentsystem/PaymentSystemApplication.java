package paymentsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

@SpringBootApplication
public class PaymentSystemApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("starting GRPC Server");
        Server server = ServerBuilder.forPort(9090)
                .addService(new PaymentService())
                .build();
        server.start();

        System.out.println("server started at " + server.getPort());
        server.awaitTermination();
        SpringApplication.run(PaymentSystemApplication.class, args);
    }


}
