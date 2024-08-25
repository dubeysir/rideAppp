package com.iamdeovrat.project.LetsRide.rideApp.entities;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.modelmapper.internal.bytebuddy.dynamic.loading.InjectionClassLoader;

import java.util.List;

@Entity
public class Wallet {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

    private  Long id;
@OneToOne(fetch = FetchType.LAZY)
    private User user;
private  Double balance;
@OneToMany(mappedBy = "wallet",fetch = FetchType.LAZY)
    private List<WalletTransaction> transaction;
}
