import java.util.ArrayList;
import java.util.List;

/* ��� - ��ࠢ� �訡�� � ��᫥�������
��ࠢ� ��⮤ containsBones � ��� �易���� � ��� ������ ⠪, �⮡�:
1. ��������� �ணࠬ�� ��⠫��� �०���, �.�. ��� ������ �뤠���� � �� ᠬ��, �� � �뤠�� ᥩ��
2. ��⮤ containsBones ������ �������� ⨯ Object � ���祭�� "Yes" ����� true, "No" ����� false
*/

public class Solution {
    public static interface Alive {
        Object containsBones();
    }

    public static class BodyPart implements Alive {
        private String name;
        public BodyPart(String name) {
            this.name = name;
        }
        public Object containsBones() {
            return "Yes";
        }
        public String toString() {
            return containsBones().equals("Yes") ? name + " ᮤ�ন� ����" : name + " �� ᮤ�ন� ����";
        }
    }
    public static class Finger extends BodyPart {
        private boolean isFoot;
        public Finger(String name, boolean isFoot) {
            super(name);
            this.isFoot = isFoot;
        }
        public Object containsBones() {
            return super.containsBones().equals("Yes") && !isFoot ? "Yes" : "No";
        }
    }
    public static void main(String[] args)
    {
        printlnFingers();
        printlnBodyParts();
        printlnAlives();
    }

    private static void printlnAlives() {
        System.out.println(new BodyPart("�㪠").containsBones());
    }

    private static void printlnBodyParts() {
        List<BodyPart> bodyParts = new ArrayList<BodyPart>(5);
        bodyParts.add(new BodyPart("�㪠"));
        bodyParts.add(new BodyPart("����"));
        bodyParts.add(new BodyPart("������"));
        bodyParts.add(new BodyPart("����"));
        System.out.println(bodyParts.toString());
    }

    private static void printlnFingers() {
        List<Finger> fingers = new ArrayList<Finger>(5);
        fingers.add(new Finger("����让", true));
        fingers.add(new Finger("�����⥫��", true));
        fingers.add(new Finger("�।���", true));
        fingers.add(new Finger("����ﭭ�", false));
        fingers.add(new Finger("�������", true));
        System.out.println(fingers.toString());
    }
}

