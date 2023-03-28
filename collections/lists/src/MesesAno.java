public class MesesAno implements Comparable<MesesAno>{

    private Integer numMes;
    private String nomeMes;
    private Double tempMediaMes;

    public MesesAno(Integer numMes, String nomeMes, Double tempMediaMes) {
        this.numMes = numMes;
        this.nomeMes = nomeMes;
        this.tempMediaMes = tempMediaMes;
    }

    public Integer getNumMes() {
        return numMes;
    }

    public void setNumMes(Integer numMes) {
        this.numMes = numMes;
    }

    public String getNomeMes() {
        return nomeMes;
    }

    public void setNomeMes(String nomeMes) {
        this.nomeMes = nomeMes;
    }

    public Double getTempMediaMes() {
        return tempMediaMes;
    }

    public void setTempMediaMes(Double tempMediaMes) {
        this.tempMediaMes = tempMediaMes;
    }

    @Override
    public String toString() {
        return "MesesAno{" + numMes + "- " + nomeMes + ", Temp. Média= " + tempMediaMes + "}\n";
    }

    @Override
    public int compareTo(MesesAno temp) {
        return this.getTempMediaMes().compareTo(temp.getTempMediaMes());
    }
}
