package constants;

public class Constants {
    // Database constants.Constants
    public static final String MONGODB_URI = "mongodb://localhost:27017";
    public static final String DATABASE_NAME = "centro_estudios";
    public static final String COLLECTION_STUDENTS = "alumnos";
    public static final String COLLECTION_TEACHERS = "profesores";

    // Menu Messages
    public static final String MAIN_MENU = "\n=== MENÚ PRINCIPAL ===";
    public static final String MENU_OPTION_1 = "1. Insertar profesor";
    public static final String MENU_OPTION_2 = "2. Insertar alumno";
    public static final String MENU_OPTION_3 = "3. Mostrar todos los datos";
    public static final String MENU_OPTION_4 = "4. Mostrar profesores";
    public static final String MENU_OPTION_5 = "5. Mostrar alumnos";
    public static final String MENU_OPTION_6 = "6. Buscar alumno por email";
    public static final String MENU_OPTION_7 = "7. Buscar profesor por rango de edad";
    public static final String MENU_OPTION_8 = "8. Actualizar profesor";
    public static final String MENU_OPTION_9 = "9. Dar de baja alumnos con calificación >= 5";
    public static final String MENU_OPTION_10 = "10. Salir";
    public static final String SELECT_OPTION = "Seleccione una opción: ";

    // Document Field Names
    public static final String FIELD_NAME = "name";
    public static final String FIELD_AGE = "age";
    public static final String FIELD_EMAIL = "email";
    public static final String FIELD_PHONE = "phone";
    public static final String FIELD_GENDER = "gender";
    public static final String FIELD_RATING = "rating";
    public static final String FIELD_SUBJECTS = "subjects";
    public static final String FIELD_TITLE = "title";
    public static final String FIELD_HIGHER_GRADE = "higher_grade";
    public static final String FIELD_CALIFICATION = "calification";

    // Input Messages
    public static final String ENTER_TEACHER_DATA = "Introduce los datos del profesor:";
    public static final String ENTER_STUDENT_DATA = "Introduce los datos del alumno:";
    public static final String ENTER_NAME = "Nombre: ";
    public static final String ENTER_AGE = "Edad: ";
    public static final String ENTER_EMAIL = "Email: ";
    public static final String ENTER_PHONE = "Teléfono: ";
    public static final String ENTER_GENDER = "Género (male/female): ";
    public static final String ENTER_TITLE = "Título: ";
    public static final String ENTER_RATING = "Valoración (0-10): ";
    public static final String ENTER_SUBJECT = "Introduce asignatura (o 'fin' para terminar): ";
    public static final String ENTER_HIGHER_GRADE = "Grado superior (DAM/DAW/ASIR): ";
    public static final String ENTER_GRADE = "Calificación (0-10): ";
    public static final String ENTER_MIN_AGE = "Introduce el rango mínimo de edad: ";
    public static final String ENTER_MAX_AGE = "Introduce el rango máximo de edad: ";
    public static final String ENTER_NEW_RATING = "Introduce la nueva calificación: ";
    public static final String END_WORD = "fin";

    // Success Messages
    public static final String CONNECTION_SUCCESS = "Conexión a MongoDB establecida con éxito";
    public static final String TEACHER_INSERTED = "Profesor insertado correctamente";
    public static final String STUDENT_INSERTED = "Alumno insertado correctamente";
    public static final String TEACHER_UPDATED = "Profesor actualizado correctamente";
    public static final String CONNECTION_CLOSED = "Conexión a MongoDB cerrada";

    // Error Messages
    public static final String CONNECTION_ERROR = "Error al conectar con MongoDB: ";
    public static final String INVALID_OPTION = "Opción no válida";
    public static final String NO_STUDENT_FOUND = "No se encontró ningún alumno con ese email";
    public static final String NO_TEACHER_FOUND = "No se encontró ningún profesor con ese email";
    public static final String EXITING_PROGRAM = "Saliendo del programa...";

    // Section Headers
    public static final String TEACHERS_SECTION = "\n=== PROFESORES ===";
    public static final String STUDENTS_SECTION = "\n=== ALUMNOS ===";

    // Result Messages
    public static final String STUDENTS_REMOVED = " alumnos han sido eliminados";
}