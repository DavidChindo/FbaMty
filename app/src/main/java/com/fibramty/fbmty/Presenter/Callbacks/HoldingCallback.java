package com.fibramty.fbmty.Presenter.Callbacks;

import com.fibramty.fbmty.Network.Response.HoldingResponse;

import java.util.List;

/**
 * Created by david.barrera on 12/7/17.
 */

public interface HoldingCallback {

    void onDownloadHolding(List<HoldingResponse> holdingResponses);

    void onDownloadError(String msg);
}
