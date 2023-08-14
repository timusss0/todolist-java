//langkah pertama membuat aplikasi adalah dengan membuat MODEL atau bisa di bilang data
public class appTodoList {
    //    string
    public static String[] model = new String[10];

    public static void main(String[] args) {
        testRemoveTodoList();
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

    public static void testShowTodoList() {
        model[0] = "belajar java dasar";
        model[1] = "belajar iklas";
        model[2] = "belajar tidur tepat waktu";
        showTodoList();
    }


    //menambahkan todo ke list
    public static void addTodoList(String todo) {

//        bagaimana jika array sudah penuh?
//        cek sudah penuh atau belum
//        apakah model penh?
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
//                model masih ada yang kosong
                isFull = false;
                break;
            }
        }

//        jika penuh kita resize ukuran array 2x lipat
        if (isFull) {
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }


//    tambahkan ke posisi yang arraynya NULL
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    //    TEST ADD TODO
    public static void testAddToDoList() {
        for (int i = 0; i < 25; i++) {
            addTodoList("contoh todo ke " + i);
        }
        showTodoList();
    }


    //menghapus todo di list
    public static boolean removeToDoList(Integer number) {
        if ((number - 1) >= model.length) {
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else {
            for (int i = (number - 1); i < model.length; i++) {
                if (i == (model.length - 1)) {
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }
            }
        }
        return false;
    }


//    buat testremove
    public static void testRemoveTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("Empat");
        addTodoList("lima");

        var result = removeToDoList(20);
        System.out.println(result);

        result = removeToDoList(2);
        System.out.println(result);
        showTodoList();
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
