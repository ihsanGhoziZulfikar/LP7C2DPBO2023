/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package synchronization;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Satria Ramadhani
 */
public class Food extends GameObject
{
    /**
     * Constructor.
     */
    
    // Default constructor.
    public Food()
    {
        super(0, 0, "Food");
        super.setHeight(30);
        super.setWidth(30);
    }
    
    // Constructor with player position.
    public Food(int x, int y)
    {
        super(x, y, "Food");
        super.setHeight(30);
        super.setWidth(30);
    }
    
    /**
     * Override interface.
     */
    
    @Override
    public void render(Graphics object)
    {
        // Set player shape.
        object.setColor(Color.decode("#ff0000"));
        object.fillRect(x, y, getWidth(), getHeight());
    }
    
    @Override
    public void loop()
    {
        // Initialize velocity, so object can move.
        this.x += this.velX;
        this.y += this.velY;
        
        // Initialize player bound, so it won't get offset the display.
        x = Game.clamp(x, 0, (Game.width - 50));
        y = Game.clamp(y, 0, (Game.height - 70));
    }
}
