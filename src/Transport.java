public abstract class Transport implements Service{
    public String modelName;
    public int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {return modelName;}

    public int getWheelsCount() {return wheelsCount;}

    public void setModelName(String modelName) {this.modelName = modelName;}

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}
