package org.tron.core.services.interfaceOnPBFT.http;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.tron.core.services.http.GetBandwidthPricesServlet;
import org.tron.core.services.interfaceOnPBFT.WalletOnPBFT;

@Component
@Slf4j(topic = "API")
public class GetBandwidthPricesOnPBFTServlet extends GetBandwidthPricesServlet {

  @Autowired
  private WalletOnPBFT walletOnPBFT;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
    walletOnPBFT.futureGet(() -> super.doGet(request, response));
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) {
    walletOnPBFT.futureGet(() -> super.doPost(request, response));
  }
}
