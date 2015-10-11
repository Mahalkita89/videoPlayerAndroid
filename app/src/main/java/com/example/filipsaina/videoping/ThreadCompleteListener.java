package com.example.filipsaina.videoping;

import java.util.List;

/**
 * Interface that every listener class must fulfill
 */
public interface ThreadCompleteListener {
    public void notifyOfThreadComplete(final List<RecycleViewItemData> data);
}


