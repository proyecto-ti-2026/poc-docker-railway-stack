CREATE TABLE restaurants (
    id          UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name        VARCHAR(120)  NOT NULL,
    description TEXT,
    category    VARCHAR(60),
    rating      DECIMAL(2,1),
    address     TEXT,
    image_url   TEXT,
    is_open     BOOLEAN DEFAULT true,
    created_at  TIMESTAMPTZ DEFAULT now()
);

INSERT INTO restaurants (name, description, category, rating, address, is_open)
VALUES
  ('La Parrilla de Juan', 'Carnes a la brasa', 'Parrilla', 4.7, 'Av. 18 de Julio 1234', true),
  ('Sushi Montevideo',    'Fusión japonesa',   'Japonés',  4.5, 'Pocitos 567',          true),
  ('El Horno',           'Pizzas artesanales', 'Pizza',    4.3, 'Cordón 890',           false);