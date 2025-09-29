package be.bstorm.tf_java2025_demospringmvc.dal.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.validator.constraints.Range;

@Entity
@NoArgsConstructor @AllArgsConstructor @Builder
// CallSuper specifie si on appelle la methode de super ou non
// Dans ce cas Equals Hashcode
@EqualsAndHashCode(of = {"id"},callSuper = false)
@ToString(of = {"id","brand","model"})
public class Car {

    @Getter
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Getter @Setter
    @Column(nullable = false, length = 50)
    private String brand;

    @Getter @Setter
    @Column(nullable = false, length = 50)
    private String model;

    @Getter @Setter
    @Column(nullable = false)
    @Range(min = 0)
    private int horsePower;

    @Getter @Setter
    @Column(nullable = false)
    @Range(min = 0)
    private int engineCylinder;
}