public class HandlerC implements Handler {
    private Handler proximo;

    @Override
    public void setProximo(Handler proximo) {
        this.proximo = proximo;
    }

    @Override
    public void processar(Pedido pedido) {
        if (pedido.getTipo().equalsIgnoreCase("C")) {
            System.out.println("HandlerC processou o pedido do tipo C");
        } else if (proximo != null) {
            proximo.processar(pedido);
        }
    }
}
