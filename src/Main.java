public class Main {
    public static void main(String[] args) {
        Handler handlerA = new HandlerA();
        Handler handlerB = new HandlerB();
        Handler handlerC = new HandlerC();

        handlerA.setProximo(handlerB);
        handlerB.setProximo(handlerC);

        Pedido pedidoA = new Pedido("A");
        Pedido pedidoB = new Pedido("B");
        Pedido pedidoC = new Pedido("C");
        Pedido pedidoD = new Pedido("D");

        handlerA.processar(pedidoA);
        handlerA.processar(pedidoB);
        handlerA.processar(pedidoC);
        handlerA.processar(pedidoD);
    }
}
