package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BishopBlackTest {

    @Test
    public void whenPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell position = bishopBlack.position();
        assertThat(position, is(Cell.A1));
    }

    @Test
    public void whenCopy() {
        BishopBlack bishop = new BishopBlack(Cell.C7);
        Figure copy = bishop.copy(Cell.C5);
        assertThat(copy.position(), is(Cell.C5));
    }

    @Test
    public void whenWay() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Cell[] cells = bishop.way(Cell.G5);
        Cell[] expected = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(cells, is(expected));
    }
    @Test
    public void diagonal() {
        BishopBlack bishopBlack =  new BishopBlack(Cell.A1);
        assertThat(bishopBlack.isDiagonal(Cell.A1, Cell.B1),is(false));
    }
}
