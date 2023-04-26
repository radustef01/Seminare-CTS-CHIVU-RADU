package facade.clase;

public class Facade {
    private Medic medic;
    private Salon salon;

    public Facade() {
        this.medic=new Medic();
        medic.adaugaPacient(new Pacient("Luis", 3));
        medic.adaugaPacient(new Pacient("Stan", 5));
        medic.adaugaPacient(new Pacient("Bilzerian", 4));
        this.salon=new Salon();

    }

    public void interneazaPacient(String nume){
        if(medic.verificaTrimitere(medic.getPacient(nume))){
            if(salon.verificaPaturiLibere()){
                if(medic.getPacient(nume).getGravitate()>4){
                    System.out.println("Pacientul" + nume + " a fost internat");
                    salon.ocupaPat();
                }
                else{
                    System.out.println("Nu e gravitatie mare, duce-ti.va akas");
                }
            }
            else{
                System.out.println("Nu exista paturi libere");
            }
        }
        else {
            System.out.println("AAAKAAAS");
        }
        System.out.println("E necesara trimitere de la medic");
    }


}
