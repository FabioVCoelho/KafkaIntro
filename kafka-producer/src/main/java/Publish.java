import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class Publish {

    public static void main(String[] args) throws InterruptedException {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("acks", "all");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        Producer<String, String> producer = new KafkaProducer<>(props);
        producer.send(new ProducerRecord<String, String>("canalDeMensagensOrgaosPublicos", "Defesa Cívil", "Aviso de tempestade"));
        Thread.sleep(3000);
        producer.send(new ProducerRecord<String, String>("canalDeMensagensOrgaosPublicos", "Corpo de bombeiros", "Arvore caida na SC-401"));
        Thread.sleep(3000);
        producer.send(new ProducerRecord<String, String>("canalDeMensagensOrgaosPublicos", "Polícia", "Assalto no centro"));
        Thread.sleep(3000);
        producer.send(new ProducerRecord<String, String>("canalDeMensagensOrgaosPublicos", "ANVISA", "Contaminação nos peixes no sul da ilha"));
        Thread.sleep(3000);
        producer.send(new ProducerRecord<String, String>("canalDeMensagemPublico", "João da Silva", "Cano de agua estourado na rua Rio Branco"));
        producer.close();
    }
}
