package hello.itemservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
//@Table(name = "item") //테이블명과 객체가 동일하면 생략 가능
public class Item {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="item_name", length = 10) //이름이 DB 컬럼과 동일하면 생략 가능
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
