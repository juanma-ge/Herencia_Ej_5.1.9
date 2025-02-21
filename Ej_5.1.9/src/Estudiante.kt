class Estudiante(nombre: String, edad: Int, id: String, val curso: String, val calificacionPromedio: Double): Persona(nombre, edad, id) {

    override fun mostrarRol() {
        println("$nombre tiene $edad años y su id es $id.")
    }

    fun mostrarCalificacion(){
        println("$nombre ha sacado un $calificacionPromedio.")
    }

}