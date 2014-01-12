/**
 * Copyright (C) 2012 - 2014 Xeiam LLC http://xeiam.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.xeiam.xchange.bitcoinium.dto.marketdata;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data object representing Ticker from Bitcoinium Web Service
 */
public final class BitcoiniumTicker {

  private final BigDecimal last;
  private final long timestamp;
  private final BigDecimal volume;
  private final BigDecimal high;
  private final BigDecimal low;
  private final BigDecimal bid;
  private final BigDecimal ask;
  private final boolean isAllTimeHigh;

  /**
   * Constructor
   * 
   * @param last
   * @param timestamp
   * @param volume
   * @param high
   * @param low
   * @param bid
   * @param ask
   * @param isAllTimeHigh
   */
  public BitcoiniumTicker(@JsonProperty("l") BigDecimal last, @JsonProperty("t") long timestamp, @JsonProperty("v") BigDecimal volume, @JsonProperty("h") BigDecimal high,
      @JsonProperty("lo") BigDecimal low, @JsonProperty("b") BigDecimal bid, @JsonProperty("a") BigDecimal ask, @JsonProperty("ath") String isAllTimeHigh) {

    this.last = last;
    this.timestamp = timestamp;
    this.volume = volume;
    this.high = high;
    this.low = low;
    this.bid = bid;
    this.ask = ask;
    this.isAllTimeHigh = isAllTimeHigh.equals("T");
  }

  public BigDecimal getLast() {

    return this.last;
  }

  public long getTimestamp() {

    return this.timestamp;
  }

  public BigDecimal getVolume() {

    return this.volume;
  }

  public BigDecimal getHigh() {

    return this.high;
  }

  public BigDecimal getLow() {

    return this.low;
  }

  public BigDecimal getBid() {

    return this.bid;
  }

  public BigDecimal getAsk() {

    return this.ask;
  }

  public boolean isAllTimeHigh() {

    return isAllTimeHigh;
  }

  @Override
  public String toString() {

    return "BitcoiniumTicker [last=" + last + ", timestamp=" + timestamp + ", volume=" + volume + ", high=" + high + ", low=" + low + ", bid=" + bid + ", ask=" + ask + "]";
  }

}
