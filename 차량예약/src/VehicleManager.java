import java.util.*;
public class VehicleManager {

    private Scanner scanner;
    private HashMap<String, Vehicle> vehicleHash;

    public VehicleManager() {
        this.scanner = new Scanner(System.in);
        this.vehicleHash = new HashMap<String, Vehicle>();
    }

    public void run(Account account) {
        boolean flag = true;
        while (flag) {
            System.out.println(" --------------------------------------------- ");
            System.out.println("1. 차량추가| 2. 차량예약| 3. 차량목록| 4. 예약현황| 5.종료");
            System.out.println(" --------------------------------------------- ");
            System.out.print("선택>>");
            int selectNo = scanner.nextInt();
            if (selectNo == 1) {
                System.out.println("--------------------");
                System.out.println("1. 택시 | 2. 버스");
                System.out.println("--------------------");
                System.out.print("선택>>");
                scanner.nextInt();
                System.out.println("차량 번호 : ");
                String vehicleNo = scanner.next();
                addVehicle(vehicleNo);
            } else if (selectNo == 2) {
                reserveVehicle(account);
            } else if (selectNo == 3) {
                vehicleList();
            } else if (selectNo == 4) {
                printSeat();
            } else if (selectNo == 5) {
                flag = false;
            }
        }
        System.out.println("종료합니다.");
    }


    private void addVehicle(String vehicleNo) { // 차량추가함수
        if (vehicleHash.containsKey(vehicleNo)) {
            System.out.println("이미 존재하는 차량번호입니다.");
        }
        if (vehicleNo.contains("taxi")) {
            vehicleHash.put(vehicleNo, new Taxi(vehicleNo, "택시"));
        }
        if (vehicleNo.contains("bus")) {
            vehicleHash.put(vehicleNo, new Bus(vehicleNo, "버스"));
        }
    }


    private void reserveVehicle(Account account) {
        System.out.print("차량 번호 : ");
        String vehicleNo = scanner.next();

        if (vehicleHash.get(vehicleNo).getType().contains("택시")) {
            Taxi t = (Taxi) vehicleHash.get(vehicleNo);
            t.setSeat(account.getName());
            System.out.print("예약이 완료되었습니다.");
        }
        if (vehicleHash.get(vehicleNo).getType().contains("버스")) {
                System.out.println("좌석 (x,y):");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                Bus b = (Bus) vehicleHash.get(vehicleNo);
                b.setSeat(x, y, account.getName());
                System.out.print("예약이 완료되었습니다.");
        }
    }

    private void vehicleList() {
        Set set = vehicleHash.entrySet();
        Iterator it = set.iterator();   // Iterator객체생성.

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            Vehicle v = (Vehicle) e.getValue();
            System.out.println("차량번호: " + e.getKey() + " 타입: " + v.getType());
        }
    }


    private void printSeat() {
        System.out.print("차량 번호 : ");
        String vehicleNo = scanner.next();

        if (vehicleHash.get(vehicleNo).getType().contains("택시")) {
            Taxi t = (Taxi) vehicleHash.get(vehicleNo);
            if (t.getSeat().isEmpty()) {
                System.out.println("-");
            } else {
                System.out.println(t.getSeat());
            }
        }

        if (vehicleHash.get(vehicleNo).getType().contains("버스")) {
            Bus b = (Bus) vehicleHash.get(vehicleNo);
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 4; j++) {
                        if (b.getSeat(i, j)==null) {
                        System.out.print("-\t");
                    }else {
                        System.out.print(b.getSeat(i, j));
                    }
                }
                System.out.println("");
            }
        }
    }
}



