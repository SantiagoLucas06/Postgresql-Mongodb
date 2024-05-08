import DaoJpa.IVendaDaoJpa;
import DomainJpa.VendaJpa;
import exception.DAOException;
import exception.TipoChaveNaoEncontradaException;
import genericJpa.GenericDaoJpa;
import genericJpa.GenericDaoJpa1;

public class VendaExclusaoDaoJpaTest extends GenericDaoJpa1<VendaJpa, Long> implements IVendaDaoJpa {

    public VendaExclusaoDaoJpaTest(){
        super(VendaJpa.class);
    }

    @Override
    public void finalizarVenda(VendaJpa vendaJpa) throws TipoChaveNaoEncontradaException, DAOException {

    }

    @Override
    public void cancelarVenda(VendaJpa vendaJpa) throws TipoChaveNaoEncontradaException, DAOException {

    }

    @Override
    public VendaJpa consultarCollection(Long id) {
        return null;
    }
}
