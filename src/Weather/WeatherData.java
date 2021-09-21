package Weather;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList observers;
    private float temperature,humidity,pressure;

    public WeatherData(){
        observers=new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i=observers.indexOf(o);
        if(i>=0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObsevers() {
        for(int i=0;i<observers.size();i++){
            Observer observer=(Observer) observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementChanged(){
        notifyObsevers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementChanged();
    }
}
