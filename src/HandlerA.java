public class HandlerA implements Handler {
    private Handler proximo;

    @Override
    public void setProximo(Handler proximo) {
        this.proximo = proximo;
    }

    @Override
    public void processar(Pedido pedido) {
        if (pedido.getTipo().equalsIgnoreCase("A")) {
            System.out.println("HandlerA processou o pedido do tipo A");
        } else if (proximo != null) {
            proximo.processar(pedido);
        }
    }
}
