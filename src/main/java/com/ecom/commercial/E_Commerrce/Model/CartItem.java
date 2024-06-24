package com.ecom.commercial.E_Commerrce.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cart_items")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "cart_item_id_seq", initialValue = 5, allocationSize = 100)
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cart_item_id_seq")
    private long item_id;

    private String item_title;

    private String item_quantity;

    private long price;

    private LocalDateTime createDateTime;

    @ManyToOne
    @JoinColumn(name = "user_info_id", referencedColumnName = "id", nullable = false)
    private UserInfo userInfo;
}
