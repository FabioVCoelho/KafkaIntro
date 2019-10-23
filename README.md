## Executando serviço Kafka
Extraia o arquivo da pasta resource para uma pasta a sua escolha

```bash
tar -xzf kafka_2.12-2.3.0.tgz
cd kafka_2.12-2.3.0
```

### Iniciando o zookeeper necessário para o servidor kafka
<code>bin/zookeeper-server-start.sh config/zookeeper.properties</code>

### Iniciando o servidor Kafka
<code>bin/kafka-server-start.sh config/server.properties</code>

Pronto o servidor do kafka está rodando na sua máquina local.

## Pub/Sub
Agora para realizar um teste de pub/sub.
Rode a classe consumer, em seguida rode a classe Publish.
Na classe consumer será possível visualizar todas as mensagens publicadas pela classe publish dentro do for.
