package com.src.yahoofinancstock.yahoo_stock_api;

import java.io.IOException;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

/**
 * Hello world!
 *
 */
public class YahooStockApi 
{
    public static void main( String[] args ) throws IOException
    {
    	Stock stock = YahooFinance.get("INTC");
        System.out.println( stock);
    }
}
