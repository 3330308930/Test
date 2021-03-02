public class Price {
    private Integer p_id;
    private String p_name;
    private  Integer p_price;

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public Integer getP_price() {
        return p_price;
    }

    public void setP_price(Integer p_price) {
        this.p_price = p_price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "p_id=" + p_id +
                ", p_name='" + p_name + '\'' +
                ", p_price=" + p_price +
                '}';
    }
}
