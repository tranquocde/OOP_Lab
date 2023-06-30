package hust.soict.dsai.aims.screen.event_handle;
import javax.naming.LimitExceededException;
import javax.swing.*;
import java.awt.*;

import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.*;

public class PlayMedia extends JDialog {
        public PlayMedia (Playable disc) throws PlayerException{
            super();
            try {
                Container cp = getContentPane();
                cp.setLayout(new FlowLayout(FlowLayout.CENTER));
                cp.add(new JLabel(disc.play()));

                setTitle("Playing");
                setSize(300, 100);
                setVisible(true);
            } catch (PlayerException e) {
                throw e;
            }
        }
    }