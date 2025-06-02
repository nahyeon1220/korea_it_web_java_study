package _26_Object;

import java.util.Objects;

public class Teacher {
    private String name;
    private String schoolName;

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return name + " 학생의 학원은 " + schoolName + "입니다.";
    }

    //equals를 오버라이드 하려면 hashCode도 같이, hashCode를 오버라이드 하려면 equals도 같이 해줘야 함.

    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
    }

    //name과 schoolName의 값을 기반으로 고유한 숫자(hashCode)룰 생성

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; //A equlas B 일 때, this가 A / obj가 B
        if (!(obj instanceof Teacher)) return false;
        Teacher teacher = (Teacher) obj;
        return this.name.equals(teacher.name) && this.schoolName.equals(teacher.schoolName);
    }
    //equals에서 같다고 판별된 객체는 같은 해시코드를 가져야 함. -> 자바의 공식 규칙
}
