//langkah pertama membuat aplikasi adalah dengan membuat MODEL atau bisa di bilang data
public class appTodoList {
    //    string
    public static String[] model = new String[10];

    public static void main(String[] args) {
        testShowTodoList();
    }
//LOGIC
//menampikan todo ke list
    public static void showTodoList() {
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

//            jika todo tidak sama dengan null
            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }

    }

    public static void testShowTodoList(){
        model[0] = "belajar java dasar";
        model[1] = "belajar iklas";
        model[2] = "belajar tidur tepat waktu";
        showTodoList();
    }


//menambahkan todo ke list
    public static void addTodoList(){

    }
//menghapus todo di list
    public static void removeToDoList(){

    }



//VIEWW

//    menampilkan view todo list
    public static void viewShowTodoList(){

    }

//    menambahkan view todo list
    public static void viewAddTodoList(){

    }

//    menghapus view todo list
    public static void viewRemoveTodoList(){

    }

}
