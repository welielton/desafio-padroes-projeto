public class HandlerB implements Handler {
    private Handler proximo;

    @Override
    public void setProximo(Handler proximo) {
        this.proximo = proximo;
    }

    @Override
    public void processar(Pedido pedido) {
        if (pedido.getTipo().equalsIgnoreCase("B")) {
            System.out.println("HandlerB processou o pedido do tipo B");
        } else if (proximo != null) {
            proximo.processar(pedido);
        }
    }
}
