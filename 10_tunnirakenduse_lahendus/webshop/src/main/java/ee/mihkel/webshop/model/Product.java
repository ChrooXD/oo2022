<<<<<<< HEAD
package ee.mihkel.webshop.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue
    Long id;
    String name;
    double price;
    String imgSrc;
    String description;
    boolean active;

    // @OneToOne   @ManyToOne   @OneToMany   @ManyToMany
    // Category category;
}
=======
package ee.mihkel.webshop.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue
    Long id;
    String name;
    double price;
    String imgSrc;
    String description;
    boolean active;

    // @OneToOne   @ManyToOne   @OneToMany   @ManyToMany
    // Category category;
}
>>>>>>> 21c8c0eab853892c96ce5230ca1b9779b06372d9
