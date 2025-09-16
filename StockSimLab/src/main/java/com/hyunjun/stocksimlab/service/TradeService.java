package com.hyunjun.stocksimlab.repository;

public interface TradeService {
    boolean buyStock(String email, Long stockId, int quantity);
    boolean sellStock(String email, Long stockId, int quantity);
}
