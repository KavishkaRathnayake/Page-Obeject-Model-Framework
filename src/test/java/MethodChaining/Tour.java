package MethodChaining;

public class Tour {




    public String Place;
    public String modeOfTravel;

    public String getPlace() {
        return Place;
    }

    public Tour setPlace(String place) {
        this.Place = place;
        return this;
    }

    public String getModeOfTravel() {
        return modeOfTravel;
    }

    public Tour setModeOfTravel(String modeOfTravel) {
        this.modeOfTravel = modeOfTravel;
        return this;
    }

    public void heyManWhereAreYouGoing(){
        System.out.println(getPlace());
        System.out.println("OOh, Athal eke " + getModeOfTravel() +" eke "+ getPlace()+ " yanawaa?" );

    }

    public static void main(String[] args) {
        Tour tour = new Tour()
                .setPlace("Colombo")
                .setModeOfTravel("car");
        tour.heyManWhereAreYouGoing();
    }
}
