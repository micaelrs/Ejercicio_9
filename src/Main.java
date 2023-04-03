public class Main{
    public static void main(String[] args){

        Cliente cliente = new Cliente();
        cliente.setNombre("micael");
        System.out.println(cliente.getNombre());
        cliente.setEdad(34);
        System.out.println("edad: " + cliente.getEdad());
        cliente.setTelefono("627-3456");
        System.out.println(cliente.getTelefono());
        cliente.setCredito(true);
        System.out.println("credito: " + cliente.isCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("luli");
        trabajador.setTelefono("6355530");
        trabajador.setSalario(18000);
        trabajador.setEdad(30);

        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());
        System.out.println(trabajador.getEdad());




    }
}
class Persona{
    int edad;
    String nombre;
    String telefono;
}
class Cliente extends Persona{
    boolean credito;
    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getNombre(){
        return "nombre: " + this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getTelefono(){
        return "telefono: " + this.telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public boolean isCredito(){
        return this.credito;
    }

    public void setCredito(boolean credito){
        this.credito = credito;
    }
}
class Trabajador extends Persona{
    int salario;

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getNombre(){
        return "nombre: " + this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getTelefono(){
        return "telefono: " + this.telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public int getSalario(){
        return this.salario;
    }
    public void setSalario(int salario){
        this.salario = salario;
    }

}
