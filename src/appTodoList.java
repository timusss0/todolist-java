public class appTodoList {

    public static String[] model = new String[10];

    public static void main(String[] args) {
    testShowTodoList();
    }

//    menampilkan
    public static void showTodoList(){
        for (var i = 0; i < model.length; i ++ ){
            var todo = model[i];
            var no = i + 1;


            if(todo != null){
                System.out.println(no + ". " + todo);
                break;
            }
        }
    }

    public static void testShowTodoList(){
        model[0] = "belajar java dasar";
        model[1] = "belajar buat project";
        model[2] = "siapa kamu?";
        showTodoList();
    }


//   menambahkan
    public static void addTodoList(String todo){

    }


//    menghapus
    public static void removeTodoList(){

    }

//   menampilkan showTodoList
    public static void viewShowTodoList(){

    }

//   menampilakn addtodolist
    public static void viewaddTodolist(){

    }

//    removeTodoList
    public static void viewRemoveTodoList(){

    }
}
