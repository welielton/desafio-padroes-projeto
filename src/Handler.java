public interface Handler {
    void setProximo(Handler proximo);
    void processar(Pedido pedido);
}
