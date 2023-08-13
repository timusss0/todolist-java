public class appTodoList {

    public static String[] model = new String[10];

    public static void main(String[] args) {
    testShowTodoList();
    }

//    menampilkan
    public static void showTodoList(){
//        cek apakah model penuh?
        var isFull = true;
        for(int i = 0; i < model.length; i++){
            if(model[i] == null){
//                modeel masih ada yg kosong
                isFull = false;
                break;
            }
        }

//        jika penuh kita resize array jadi 2x lipat
        if(isFull){
            var temp = model;
            model = new String[model.length * 2];
            for (var i = 0; i < temp.length; i++){
                model[i] = temp[i];
            }
        }

        for (var i = 0; i < model.length; i ++ ){
            var todo = model[i];
            var no = i + 1;


            if(todo == null){
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
