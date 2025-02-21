class Profesor(nombre: String, edad: Int, id: String, val departamento: String, val aniosExpereiencia: Int): Persona(nombre, edad, id)  {

    override fun mostrarRol() {
        println("$nombre tiene $edad años y su id es $id.")
    }

    fun mostrarExpereiencia(){
        println("$nombre tiene $aniosExpereiencia años de expereiencia.")
    }

}